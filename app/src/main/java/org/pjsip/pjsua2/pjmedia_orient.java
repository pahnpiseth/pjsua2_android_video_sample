/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjmedia_orient {
  public final static pjmedia_orient PJMEDIA_ORIENT_UNKNOWN = new pjmedia_orient("PJMEDIA_ORIENT_UNKNOWN");
  public final static pjmedia_orient PJMEDIA_ORIENT_NATURAL = new pjmedia_orient("PJMEDIA_ORIENT_NATURAL");
  public final static pjmedia_orient PJMEDIA_ORIENT_ROTATE_90DEG = new pjmedia_orient("PJMEDIA_ORIENT_ROTATE_90DEG");
  public final static pjmedia_orient PJMEDIA_ORIENT_ROTATE_180DEG = new pjmedia_orient("PJMEDIA_ORIENT_ROTATE_180DEG");
  public final static pjmedia_orient PJMEDIA_ORIENT_ROTATE_270DEG = new pjmedia_orient("PJMEDIA_ORIENT_ROTATE_270DEG");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjmedia_orient swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjmedia_orient.class + " with value " + swigValue);
  }

  private pjmedia_orient(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjmedia_orient(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjmedia_orient(String swigName, pjmedia_orient swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjmedia_orient[] swigValues = { PJMEDIA_ORIENT_UNKNOWN, PJMEDIA_ORIENT_NATURAL, PJMEDIA_ORIENT_ROTATE_90DEG, PJMEDIA_ORIENT_ROTATE_180DEG, PJMEDIA_ORIENT_ROTATE_270DEG };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

