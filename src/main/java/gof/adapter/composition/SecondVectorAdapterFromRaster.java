package gof.adapter.composition;

import gof.adapter.entity.RasterGraphic;
import gof.adapter.entity.VectorGraphicsInterface;

public class SecondVectorAdapterFromRaster implements VectorGraphicsInterface {
    private RasterGraphic rasterGraphic = new RasterGraphic();

    @Override
    public void drawLine() {
        rasterGraphic.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphic.drawRasterSquare();
    }
}
