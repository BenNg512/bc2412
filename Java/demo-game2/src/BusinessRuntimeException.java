public class BusinessRuntimeException extends RuntimeException {
  public static BusinessRuntimeException of (SysError sysErr) { // Best Design
    return new BusinessRuntimeException(sysErr);
  }

  public BusinessRuntimeException (SysError sysErr) {
  super(sysErr.getDesc());
  }

}