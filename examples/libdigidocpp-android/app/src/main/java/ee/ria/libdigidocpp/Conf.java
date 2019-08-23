/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ee.ria.libdigidocpp;

public class Conf {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Conf(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Conf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        digidocJNI.delete_Conf(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Conf transfer() {
    swigCMemOwn = false;
    return this;
  }

  public Conf() {
    this(digidocJNI.new_Conf(), true);
  }

  public static void init(Conf conf) {
    digidocJNI.Conf_init(Conf.getCPtr(conf), conf);
  }

  public static Conf instance() {
    long cPtr = digidocJNI.Conf_instance();
    return (cPtr == 0) ? null : new Conf(cPtr, false);
  }

  public int logLevel() {
    return digidocJNI.Conf_logLevel(swigCPtr, this);
  }

  public String logFile() {
    return digidocJNI.Conf_logFile(swigCPtr, this);
  }

  public String xsdPath() {
    return digidocJNI.Conf_xsdPath(swigCPtr, this);
  }

  public String PKCS11Driver() {
    return digidocJNI.Conf_PKCS11Driver(swigCPtr, this);
  }

  public String proxyHost() {
    return digidocJNI.Conf_proxyHost(swigCPtr, this);
  }

  public String proxyPort() {
    return digidocJNI.Conf_proxyPort(swigCPtr, this);
  }

  public String proxyUser() {
    return digidocJNI.Conf_proxyUser(swigCPtr, this);
  }

  public String proxyPass() {
    return digidocJNI.Conf_proxyPass(swigCPtr, this);
  }

  public boolean proxyForceSSL() {
    return digidocJNI.Conf_proxyForceSSL(swigCPtr, this);
  }

  public boolean proxyTunnelSSL() {
    return digidocJNI.Conf_proxyTunnelSSL(swigCPtr, this);
  }

  public String digestUri() {
    return digidocJNI.Conf_digestUri(swigCPtr, this);
  }

  public String signatureDigestUri() {
    return digidocJNI.Conf_signatureDigestUri(swigCPtr, this);
  }

  public String ocsp(String issuer) {
    return digidocJNI.Conf_ocsp(swigCPtr, this, issuer);
  }

  public String TSUrl() {
    return digidocJNI.Conf_TSUrl(swigCPtr, this);
  }

  public String verifyServiceUri() {
    return digidocJNI.Conf_verifyServiceUri(swigCPtr, this);
  }

  public String PKCS12Cert() {
    return digidocJNI.Conf_PKCS12Cert(swigCPtr, this);
  }

  public String PKCS12Pass() {
    return digidocJNI.Conf_PKCS12Pass(swigCPtr, this);
  }

  public boolean PKCS12Disable() {
    return digidocJNI.Conf_PKCS12Disable(swigCPtr, this);
  }

  public boolean TSLAllowExpired() {
    return digidocJNI.Conf_TSLAllowExpired(swigCPtr, this);
  }

  public boolean TSLAutoUpdate() {
    return digidocJNI.Conf_TSLAutoUpdate(swigCPtr, this);
  }

  public String TSLCache() {
    return digidocJNI.Conf_TSLCache(swigCPtr, this);
  }

  public boolean TSLOnlineDigest() {
    return digidocJNI.Conf_TSLOnlineDigest(swigCPtr, this);
  }

  public int TSLTimeOut() {
    return digidocJNI.Conf_TSLTimeOut(swigCPtr, this);
  }

  public String TSLUrl() {
    return digidocJNI.Conf_TSLUrl(swigCPtr, this);
  }

}
