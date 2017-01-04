package ai.h2o.cascade.core;

/**
 * Numeric (double) value.
 */
public class ValNum extends Val {
  private double value;


  public ValNum(double d) {
    value = d;
  }

  public ValNum(long d) {
    value = d;
  }

  public ValNum(int d) {
    value = d;
  }

  public ValNum(boolean d) {
    value = d? 1 : 0;
  }

  @Override public Type type() {
    return Type.NUM;
  }


  //--------------------------------------------------------------------------------------------------------------------
  // Value representations
  //--------------------------------------------------------------------------------------------------------------------

  @Override public boolean isNum() {
    return true;
  }

  @Override public double getNum() {
    return value;
  }


  @Override public boolean isInt() {
    return (int) value == value;
  }

  @Override public int getInt() {
    return (int) value;
  }


  @Override public boolean isBool() {
    return value == 0 || value == 1;
  }

  @Override public boolean getBool() {
    return value != 0;
  }

  @Override public boolean isSlice() {
    return (long) value == value;
  }

  @Override public SliceList getSlice() {
    return new SliceList((long) value);
  }
}
