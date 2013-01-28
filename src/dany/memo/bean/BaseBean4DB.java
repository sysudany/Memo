package dany.memo.bean;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * base bean when it's necessary to save in the database
 * @author chendy
 *
 */
public abstract class BaseBean4DB {
	/**
	 * primary key for database 
	 */
	protected int _id ;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}
	
	/**
	 * content values when inserting into database
	 * @return
	 */
	public abstract ContentValues getContentValues();
	
	/**
	 * generate the object when reading the cursor of database
	 * child may change the return type to the real type
	 * @param cursor
	 * @return
	 */
	public abstract BaseBean4DB cursorToBean(Cursor cursor);
}
