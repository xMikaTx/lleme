package corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentRepositoryPOA.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

public abstract class ComponentRepositoryPOA extends
		org.omg.PortableServer.Servant implements
		corbaObjects.scs.ComponentRepositoryOperations,
		org.omg.CORBA.portable.InvokeHandler {

	// Constructors

	private static java.util.Hashtable _methods = new java.util.Hashtable();

	static {
		_methods.put("install", new java.lang.Integer(0));
		_methods.put("uninstall", new java.lang.Integer(1));
		_methods.put("copy", new java.lang.Integer(2));
		_methods.put("getComponentFile", new java.lang.Integer(3));
		_methods.put("getComponentDescription", new java.lang.Integer(4));
		_methods.put("getInstalledComponents", new java.lang.Integer(5));
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
		case 0: // corbaObjects/scs/ComponentRepository/install
		{
			try {
				corbaObjects.scs.ComponentId id = corbaObjects.scs.ComponentIdHelper
						.read(in);
				String entry_point = in.read_string();
				boolean shared = in.read_boolean();
				byte file[] = corbaObjects.scs.OctetSeqHelper.read(in);
				String help_info = in.read_string();
				this.install(id, entry_point, shared, file, help_info);
				out = $rh.createReply();
			} catch (corbaObjects.scs.ComponentAlreadyInstalled $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.ComponentAlreadyInstalledHelper
						.write(out, $ex);
			} catch (corbaObjects.scs.IOException $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.IOExceptionHelper.write(out, $ex);
			}
			break;
		}

		case 1: // corbaObjects/scs/ComponentRepository/uninstall
		{
			try {
				corbaObjects.scs.ComponentId id = corbaObjects.scs.ComponentIdHelper
						.read(in);
				this.uninstall(id);
				out = $rh.createReply();
			} catch (corbaObjects.scs.ComponentNotInstalled $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.ComponentNotInstalledHelper.write(out, $ex);
			} catch (corbaObjects.scs.IOException $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.IOExceptionHelper.write(out, $ex);
			}
			break;
		}

		case 2: // corbaObjects/scs/ComponentRepository/copy
		{
			try {
				corbaObjects.scs.ComponentId id = corbaObjects.scs.ComponentIdHelper
						.read(in);
				corbaObjects.scs.ComponentRepository rep = corbaObjects.scs.ComponentRepositoryHelper
						.read(in);
				this.copy(id, rep);
				out = $rh.createReply();
			} catch (corbaObjects.scs.ComponentAlreadyInstalled $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.ComponentAlreadyInstalledHelper
						.write(out, $ex);
			} catch (corbaObjects.scs.ComponentNotInstalled $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.ComponentNotInstalledHelper.write(out, $ex);
			}
			break;
		}

		case 3: // corbaObjects/scs/ComponentRepository/getComponentFile
		{
			try {
				corbaObjects.scs.ComponentId id = corbaObjects.scs.ComponentIdHelper
						.read(in);
				byte $result[] = null;
				$result = this.getComponentFile(id);
				out = $rh.createReply();
				corbaObjects.scs.OctetSeqHelper.write(out, $result);
			} catch (corbaObjects.scs.ComponentNotInstalled $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.ComponentNotInstalledHelper.write(out, $ex);
			} catch (corbaObjects.scs.IOException $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.IOExceptionHelper.write(out, $ex);
			}
			break;
		}

		case 4: // corbaObjects/scs/ComponentRepository/getComponentDescription
		{
			try {
				corbaObjects.scs.ComponentId id = corbaObjects.scs.ComponentIdHelper
						.read(in);
				corbaObjects.scs.ComponentDescription $result = null;
				$result = this.getComponentDescription(id);
				out = $rh.createReply();
				corbaObjects.scs.ComponentDescriptionHelper.write(out, $result);
			} catch (corbaObjects.scs.ComponentNotInstalled $ex) {
				out = $rh.createExceptionReply();
				corbaObjects.scs.ComponentNotInstalledHelper.write(out, $ex);
			}
			break;
		}

		case 5: // corbaObjects/scs/ComponentRepository/getInstalledComponents
		{
			corbaObjects.scs.ComponentDescription $result[] = null;
			$result = this.getInstalledComponents();
			out = $rh.createReply();
			corbaObjects.scs.ComponentDescriptionSeqHelper.write(out, $result);
			break;
		}

		default:
			throw new org.omg.CORBA.BAD_OPERATION(0,
					org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
		}

		return out;
	} // _invoke

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:corbaObjects/scs/ComponentRepository:1.0" };

	public String[] _all_interfaces(org.omg.PortableServer.POA poa,
			byte[] objectId) {
		return __ids.clone();
	}

	public ComponentRepository _this() {
		return ComponentRepositoryHelper.narrow(super._this_object());
	}

	public ComponentRepository _this(org.omg.CORBA.ORB orb) {
		return ComponentRepositoryHelper.narrow(super._this_object(orb));
	}

} // class ComponentRepositoryPOA
