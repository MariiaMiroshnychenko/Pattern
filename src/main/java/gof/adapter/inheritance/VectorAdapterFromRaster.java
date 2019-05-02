package gof.adapter.inheritance;

import gof.adapter.entity.RasterGraphic;
import gof.adapter.entity.VectorGraphicsInterface;

public class VectorAdapterFromRaster extends RasterGraphic implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
