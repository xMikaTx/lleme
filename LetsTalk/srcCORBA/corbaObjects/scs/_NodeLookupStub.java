package corbaObjects.scs;

/**
 * corbaObjects/scs/_NodeLookupStub.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from deployment.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min28s BRST
 */

@SuppressWarnings("serial")
public class _NodeLookupStub extends org.omg.CORBA.portable.ObjectImpl
		implements corbaObjects.scs.NodeLookup {

	public corbaObjects.scs.NodeDescription getNode(String name) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("getNode", true);
			$out.write_string(name);
			$in = _invoke($out);
			corbaObjects.scs.NodeDescription $result = corbaObjects.scs.NodeDescriptionHelper
					.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return getNode(name);
		} finally {
			_releaseReply($in);
		}
	} // getNode

	public corbaObjects.scs.NodeDescription[] getNodes(
			corbaObjects.scs.Property[] props) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("getNodes",
					true);
			corbaObjects.scs.PropertySeqHelper.write($out, props);
			$in = _invoke($out);
			corbaObjects.scs.NodeDescription $result[] = corbaObjects.scs.NodeDescriptionSeqHelper
					.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return getNodes(props);
		} finally {
			_releaseReply($in);
		}
	} // getNodes

	public corbaObjects.scs.NodeDescription[] getAllNodes() {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("getAllNodes",
					true);
			$in = _invoke($out);
			corbaObjects.scs.NodeDescription $result[] = corbaObjects.scs.NodeDescriptionSeqHelper
					.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return getAllNodes();
		} finally {
			_releaseReply($in);
		}
	} // getAllNodes

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:corbaObjects/scs/NodeLookup:1.0" };

	public String[] _ids() {
		return __ids.clone();
	}

	private void readObject(java.io.ObjectInputStream s)
			throws java.io.IOException {
		String str = s.readUTF();
		String[] args = null;
		java.util.Properties props = null;
		org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init(args, props)
				.string_to_object(str);
		org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
				._get_delegate();
		_set_delegate(delegate);
	}

	private void writeObject(java.io.ObjectOutputStream s)
			throws java.io.IOException {
		String[] args = null;
		java.util.Properties props = null;
		String str = org.omg.CORBA.ORB.init(args, props).object_to_string(this);
		s.writeUTF(str);
	}
} // class _NodeLookupStub
