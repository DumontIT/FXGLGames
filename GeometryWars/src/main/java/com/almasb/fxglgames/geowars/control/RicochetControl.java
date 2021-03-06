package com.almasb.fxglgames.geowars.control;

import com.almasb.fxgl.app.FXGL;
import com.almasb.fxgl.entity.Control;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.component.BoundingBoxComponent;
import com.almasb.fxgl.entity.component.Required;
import com.almasb.fxgl.entity.control.ProjectileControl;
import com.almasb.fxglgames.geowars.GeoWarsApp;
import javafx.geometry.Point2D;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
@Required(BoundingBoxComponent.class)
public class RicochetControl extends Control {

    private BoundingBoxComponent bbox;

    @Override
    public void onUpdate(Entity entity, double tpf) {

        if (bbox.getMinXWorld() < 0 || bbox.getMaxXWorld() > FXGL.getApp().getWidth()
                || bbox.getMinYWorld() < 0 || bbox.getMaxYWorld() > FXGL.getApp().getHeight()) {

            Point2D direction = FXGL.<GeoWarsApp>getAppCast()
                    .getPlayer()
                    .getCenter()
                    .subtract(bbox.getCenterWorld());

            entity.getControl(ProjectileControl.class).setDirection(direction);
        }
    }
}
