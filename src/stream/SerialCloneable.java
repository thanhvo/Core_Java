package stream;

import java.io.*;

public class SerialCloneable implements Cloneable, Serializable {
	public Object clone() {
		try {
			// save the object to a byte array
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject(this);
			out.close();
			
			// read a clone of the object from the byte array 
			ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
			ObjectInputStream in = new ObjectInputStream(bin);
			Object ret = in.readObject();
			in.close();
			
			return ret;
		} catch (Exception e) {
			return null;
		}
	}
}
