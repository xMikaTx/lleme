package corbaObjects.letstalk;

/**
 * corbaObjects/letstalk/_UserFacetStub.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from letstalk.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min29s BRST
 */

public class _UserFacetStub extends org.omg.CORBA.portable.ObjectImpl implements
		corbaObjects.letstalk.UserFacet {

	public void subscribe(String login, String password)
			throws corbaObjects.letstalk.InvalidSubscriptionValues,
			corbaObjects.scs.InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("subscribe",
					true);
			$out.write_string(login);
			$out.write_string(password);
			$in = _invoke($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id
					.equals("IDL:corbaObjects/letstalk/InvalidSubscriptionValues:1.0"))
				throw corbaObjects.letstalk.InvalidSubscriptionValuesHelper
						.read($in);
			else if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw corbaObjects.scs.InternalErrorHelper.read($in);
			else
				throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			subscribe(login, password);
		} finally {
			_releaseReply($in);
		}
	} // subscribe

	public int connect(String login, String password, org.omg.CORBA.Object host)
			throws corbaObjects.scs.InvalidName,
			corbaObjects.scs.InvalidConnection,
			corbaObjects.scs.AlreadyConnected,
			corbaObjects.scs.ExceededConnectionLimit,
			corbaObjects.scs.InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("connect", true);
			$out.write_string(login);
			$out.write_string(password);
			org.omg.CORBA.ObjectHelper.write($out, host);
			$in = _invoke($out);
			int $result = corbaObjects.scs.ConnectionIdHelper.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:corbaObjects/scs/InvalidName:1.0"))
				throw corbaObjects.scs.InvalidNameHelper.read($in);
			else if (_id.equals("IDL:corbaObjects/scs/InvalidConnection:1.0"))
				throw corbaObjects.scs.InvalidConnectionHelper.read($in);
			else if (_id.equals("IDL:corbaObjects/scs/AlreadyConnected:1.0"))
				throw corbaObjects.scs.AlreadyConnectedHelper.read($in);
			else if (_id
					.equals("IDL:corbaObjects/scs/ExceededConnectionLimit:1.0"))
				throw corbaObjects.scs.ExceededConnectionLimitHelper.read($in);
			else if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw corbaObjects.scs.InternalErrorHelper.read($in);
			else
				throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return connect(login, password, host);
		} finally {
			_releaseReply($in);
		}
	} // connect

	public void disconnect(String login)
			throws corbaObjects.scs.InvalidConnection,
			corbaObjects.scs.NoConnection, corbaObjects.scs.InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("disconnect",
					true);
			$out.write_string(login);
			$in = _invoke($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:corbaObjects/scs/InvalidConnection:1.0"))
				throw corbaObjects.scs.InvalidConnectionHelper.read($in);
			else if (_id.equals("IDL:corbaObjects/scs/NoConnection:1.0"))
				throw corbaObjects.scs.NoConnectionHelper.read($in);
			else if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw corbaObjects.scs.InternalErrorHelper.read($in);
			else
				throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			disconnect(login);
		} finally {
			_releaseReply($in);
		}
	} // disconnect

	public String[] listUsers() throws corbaObjects.scs.InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("listUsers",
					true);
			$in = _invoke($out);
			String $result[] = corbaObjects.letstalk.stringListHelper.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw corbaObjects.scs.InternalErrorHelper.read($in);
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return listUsers();
		} finally {
			_releaseReply($in);
		}
	} // listUsers

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:corbaObjects/letstalk/UserFacet:1.0" };

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
} // class _UserFacetStub
