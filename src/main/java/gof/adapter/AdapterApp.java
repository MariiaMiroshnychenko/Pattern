package gof.adapter;

import gof.adapter.composition.SecondVectorAdapterFromRaster;
import gof.adapter.entity.VectorGraphicsInterface;
import gof.adapter.inheritance.VectorAdapterFromRaster;

public class AdapterApp {
    public static void main(String[] args) {
        VectorAdapterFromRaster gr = new VectorAdapterFromRaster();

        gr.drawLine();
        gr.drawSquare();

        System.out.println();

        SecondVectorAdapterFromRaster secGr = new SecondVectorAdapterFromRaster();

        secGr.drawLine();
        secGr.drawSquare();
    }
}
