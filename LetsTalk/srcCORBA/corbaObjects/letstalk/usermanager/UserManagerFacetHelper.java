package corbaObjects.letstalk.usermanager;

/**
 * corbaObjects/letstalk/usermanager/UserManagerFacetHelper.java . Generated by
 * the IDL-to-Java compiler (portable), version "3.2" from letstalk.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min29s BRST
 */

abstract public class UserManagerFacetHelper {
	private static String _id = "IDL:corbaObjects/letstalk/usermanager/UserManagerFacet:1.0";

	public static void insert(org.omg.CORBA.Any a,
			corbaObjects.letstalk.usermanager.UserManagerFacet that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static corbaObjects.letstalk.usermanager.UserManagerFacet extract(
			org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			__typeCode = org.omg.CORBA.ORB.init().create_interface_tc(
					corbaObjects.letstalk.usermanager.UserManagerFacetHelper
							.id(), "UserManagerFacet");
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static corbaObjects.letstalk.usermanager.UserManagerFacet read(
			org.omg.CORBA.portable.InputStream istream) {
		return narrow(istream.read_Object(_UserManagerFacetStub.class));
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			corbaObjects.letstalk.usermanager.UserManagerFacet value) {
		ostream.write_Object(value);
	}

	public static corbaObjects.letstalk.usermanager.UserManagerFacet narrow(
			org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof corbaObjects.letstalk.usermanager.UserManagerFacet)
			return (corbaObjects.letstalk.usermanager.UserManagerFacet) obj;
		else if (!obj._is_a(id()))
			throw new org.omg.CORBA.BAD_PARAM();
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			corbaObjects.letstalk.usermanager._UserManagerFacetStub stub = new corbaObjects.letstalk.usermanager._UserManagerFacetStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

	public static corbaObjects.letstalk.usermanager.UserManagerFacet unchecked_narrow(
			org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof corbaObjects.letstalk.usermanager.UserManagerFacet)
			return (corbaObjects.letstalk.usermanager.UserManagerFacet) obj;
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			corbaObjects.letstalk.usermanager._UserManagerFacetStub stub = new corbaObjects.letstalk.usermanager._UserManagerFacetStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

}
