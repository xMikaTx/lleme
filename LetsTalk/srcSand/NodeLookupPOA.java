/**
 * NodeLookupPOA.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from deployment.idl Saturday, December 10, 2005 1:24:06 AM GMT
 */

public abstract class NodeLookupPOA extends org.omg.PortableServer.Servant
		implements NodeLookupOperations, org.omg.CORBA.portable.InvokeHandler {

	// Constructors

	private static java.util.Hashtable _methods = new java.util.Hashtable();
	static {
		_methods.put("getNode", new java.lang.Integer(0));
		_methods.put("getNodes", new java.lang.Integer(1));
		_methods.put("getAllNodes", new java.lang.Integer(2));
	}

	public org.omg.CORBA.portable.OutputStream _invoke(String $method,
			org.omg.CORBA.portable.InputStream in,
			org.omg.CORBA.portable.ResponseHandler $rh) {
		org.omg.CORBA.portable.OutputStream out = null;
		java.lang.Integer __method = (java.lang.Integer) _methods.get($method);
		if (__method == null)
			throw new org.omg.CORBA.BAD_OPERATION(0,
					org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

		switch (__method.intValue()) {
		case 0: // NodeLookup/getNode
		{
			String name = in.read_string();
			NodeDescription $result = null;
			$result = this.getNode(name);
			out = $rh.createReply();
			NodeDescriptionHelper.write(out, $result);
			break;
		}

		case 1: // NodeLookup/getNodes
		{
			Property props[] = PropertySeqHelper.read(in);
			NodeDescription $result[] = null;
			$result = this.getNodes(props);
			out = $rh.createReply();
			NodeDescriptionSeqHelper.write(out, $result);
			break;
		}

		case 2: // NodeLookup/getAllNodes
		{
			NodeDescription $result[] = null;
			$result = this.getAllNodes();
			out = $rh.createReply();
			NodeDescriptionSeqHelper.write(out, $result);
			break;
		}

		default:
			throw new org.omg.CORBA.BAD_OPERATION(0,
					org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
		}

		return out;
	} // _invoke

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:NodeLookup:1.0" };

	public String[] _all_interfaces(org.omg.PortableServer.POA poa,
			byte[] objectId) {
		return (String[]) __ids.clone();
	}

	public NodeLookup _this() {
		return NodeLookupHelper.narrow(super._this_object());
	}

	public NodeLookup _this(org.omg.CORBA.ORB orb) {
		return NodeLookupHelper.narrow(super._this_object(orb));
	}

} // class NodeLookupPOA
