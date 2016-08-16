package corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentRepositoryHelper.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from deployment.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min28s BRST
 */

abstract public class ComponentRepositoryHelper {
	private static String _id = "IDL:corbaObjects/scs/ComponentRepository:1.0";

	public static void insert(org.omg.CORBA.Any a,
			corbaObjects.scs.ComponentRepository that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static corbaObjects.scs.ComponentRepository extract(
			org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			__typeCode = org.omg.CORBA.ORB.init().create_interface_tc(
					corbaObjects.scs.ComponentRepositoryHelper.id(),
					"ComponentRepository");
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static corbaObjects.scs.ComponentRepository read(
			org.omg.CORBA.portable.InputStream istream) {
		return narrow(istream.read_Object(_ComponentRepositoryStub.class));
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			corbaObjects.scs.ComponentRepository value) {
		ostream.write_Object(value);
	}

	public static corbaObjects.scs.ComponentRepository narrow(
			org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof corbaObjects.scs.ComponentRepository)
			return (corbaObjects.scs.ComponentRepository) obj;
		else if (!obj._is_a(id()))
			throw new org.omg.CORBA.BAD_PARAM();
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			corbaObjects.scs._ComponentRepositoryStub stub = new corbaObjects.scs._ComponentRepositoryStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

	public static corbaObjects.scs.ComponentRepository unchecked_narrow(
			org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof corbaObjects.scs.ComponentRepository)
			return (corbaObjects.scs.ComponentRepository) obj;
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			corbaObjects.scs._ComponentRepositoryStub stub = new corbaObjects.scs._ComponentRepositoryStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

}
