/**
 * ShutdownFailedHolder.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM GMT
 */

public final class ShutdownFailedHolder implements
		org.omg.CORBA.portable.Streamable {
	public ShutdownFailed value = null;

	public ShutdownFailedHolder() {
	}

	public ShutdownFailedHolder(ShutdownFailed initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = ShutdownFailedHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		ShutdownFailedHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return ShutdownFailedHelper.type();
	}

}
