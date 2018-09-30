/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmatrixdemo;

/**
 *
 * @author kaiyan
 */
public class RationalMatrix extends GenericMatrix<Rational>{

    @Override
    protected Rational add(Rational o1, Rational o2) {
        return o1.add(o2);
    }

    @Override
    protected Rational multiply(Rational o1, Rational o2) {
        return o1.multiply(o2);
    }

    @Override
    protected Rational zero() {
        return new Rational(0, 1);
    }
}
