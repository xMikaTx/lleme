package corbaObjects.letstalk;

/**
 * corbaObjects/letstalk/_ServerCallBackFacetStub.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from letstalk.idl Sexta-feira,
 * 9 de Dezembro de 2005 18h26min29s BRST
 */

public class _ServerCallBackFacetStub extends org.omg.CORBA.portable.ObjectImpl
		implements corbaObjects.letstalk.ServerCallBackFacet {

	public void receiveMessage(String user, String chatId, String[] userId,
			String message) throws corbaObjects.scs.InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request(
					"receiveMessage", true);
			$out.write_string(user);
			$out.write_string(chatId);
			corbaObjects.letstalk.stringListHelper.write($out, userId);
			$out.write_string(message);
			$in = _invoke($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw corbaObjects.scs.InternalErrorHelper.read($in);
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			receiveMessage(user, chatId, userId, message);
		} finally {
			_releaseReply($in);
		}
	} // receiveMessage

	public void updateDirectory() throws corbaObjects.scs.InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request(
					"updateDirectory", true);
			$in = _invoke($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw corbaObjects.scs.InternalErrorHelper.read($in);
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			updateDirectory();
		} finally {
			_releaseReply($in);
		}
	} // updateDirectory

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:corbaObjects/letstalk/ServerCallBackFacet:1.0" };

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
} // class _ServerCallBackFacetStub
