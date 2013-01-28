package dany.common.util;

import android.app.Application;
import android.widget.TextView;
import android.widget.Toast;

/**
 * singleton toast, you should init the context in your application 
 * @author chendy
 *
 */
public class Toasts {
	
	private static Application mApp;
	private static Toast mToast;
	private static final int TOAST_TEXT_SIZE = 20;
	
	public static void init(Application app) {
		mApp = app;
	}

	public static void showToast(String msg) {
		getToast(msg, Toast.LENGTH_SHORT).show();
	}
	
	public static void showToast(int resId) {
		getToast(resId, Toast.LENGTH_SHORT).show();
	}
	
	public static void showToastLong(String msg) {
		getToast(msg, Toast.LENGTH_LONG).show();
	}
	
	public static void showToastLong(int resId) {
		getToast(resId, Toast.LENGTH_LONG).show();
	}

	/**
	 * custom your toast 
	 * @param msg
	 * @param len
	 * @return
	 */
	private static Toast getToast(String msg, int len) {
		if(mApp == null){
			throw new RuntimeException("you should call ToastUtil.init in you application");
		}
		if (mToast == null) {
			mToast = Toast.makeText(mApp, msg, len);
			// mToast.setGravity(Gravity.CENTER, 0, 0);
			TextView tv = (TextView) mToast.getView().findViewById(
					android.R.id.message);
			if(tv != null){
				tv.setTextSize(TOAST_TEXT_SIZE);
			}
		}
		mToast.setText(msg);
		mToast.setDuration(len);
		return mToast;
	}
	
	private static Toast getToast(int resId, int len) {
		if(mApp == null){
			throw new RuntimeException("you should call ToastUtil.init in you application");
		}
		return getToast(mApp.getString(resId), len);
	}
}