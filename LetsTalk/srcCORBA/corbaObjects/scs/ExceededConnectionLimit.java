package corbaObjects.scs;

/**
 * corbaObjects/scs/ExceededConnectionLimit.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min26s BRST
 */

@SuppressWarnings("serial")
public final class ExceededConnectionLimit extends org.omg.CORBA.UserException {

	public ExceededConnectionLimit() {
		super(ExceededConnectionLimitHelper.id());
	} // ctor

	public ExceededConnectionLimit(String $reason) {
		super(ExceededConnectionLimitHelper.id() + "  " + $reason);
	} // ctor

} // class ExceededConnectionLimit
