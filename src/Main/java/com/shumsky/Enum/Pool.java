package com.shumsky.Enum;

public class Pool {
    private String a;
    private String y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pool pool = (Pool) o;

        if (Double.compare(pool.d, d) != 0) return false;
        if (f != pool.f) return false;
        if (!a.equals(pool.a)) return false;
        if (!y.equals(pool.y)) return false;
        if (!b.equals(pool.b)) return false;
        if (!c.equals(pool.c)) return false;
        if (!q.equals(pool.q)) return false;
        if (!w.equals(pool.w)) return false;
        if (!e.equals(pool.e)) return false;
        return r.equals(pool.r);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = a.hashCode();
        result = 31 * result + y.hashCode();
        result = 31 * result + b.hashCode();
        temp = Double.doubleToLongBits(d);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + f;
        result = 31 * result + c.hashCode();
        result = 31 * result + q.hashCode();
        result = 31 * result + w.hashCode();
        result = 31 * result + e.hashCode();
        result = 31 * result + r.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "a='" + a + '\'' +
                ", y='" + y + '\'' +
                ", b='" + b + '\'' +
                ", d=" + d +
                ", f=" + f +
                ", c='" + c + '\'' +
                ", q='" + q + '\'' +
                ", w='" + w + '\'' +
                ", e='" + e + '\'' +
                ", r='" + r + '\'' +
                '}';
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setF(int f) {
        this.f = f;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public void setW(String w) {
        this.w = w;
    }

    public void setE(String e) {
        this.e = e;
    }

    public void setR(String r) {
        this.r = r;
    }

    private String b;
    private double d;
    private int f;

    public String getA() {
        return a;
    }

    public String getY() {
        return y;
    }

    public String getB() {
        return b;
    }

    public double getD() {
        return d;
    }

    public int getF() {
        return f;
    }

    public String getC() {
        return c;
    }

    public String getQ() {
        return q;
    }

    public String getW() {
        return w;
    }

    public String getE() {
        return e;
    }

    public String getR() {
        return r;
    }

    public Pool(String a) {
        this.a = a;
    }

    private String c;
    private String q;
    private String w;
    private String e;
    private String r;

}
