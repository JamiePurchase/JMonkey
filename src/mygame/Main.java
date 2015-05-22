package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Spatial;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp()
    {
        // Landscape
        Spatial land_g = new Geometry("Land", new Box(50.0f, 1.0f, 50.0f));
        Material land_m = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        land_m.setTexture("ColorMap", assetManager.loadTexture("Textures/grass1.png"));
        land_g.setMaterial(land_m);
        land_g.setLocalTranslation(2.0f, -2.5f, 0.0f);
        rootNode.attachChild(land_g);
        
        // Stone 01
        Spatial stone_g01 = new Geometry("Stone01", new Box(1.0f, 1.0f, 1.0f));
        Material stone_m = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        stone_m.setTexture("ColorMap", assetManager.loadTexture("Textures/stone1.png"));
        stone_g01.setMaterial(stone_m);
        stone_g01.setLocalTranslation(2.0f, -0.5f, 0.0f);
        rootNode.attachChild(stone_g01);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
