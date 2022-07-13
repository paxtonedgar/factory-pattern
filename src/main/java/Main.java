import CameraPackage.Camera;
import CameraPackage.CameraFactory;

public class Main {
    public static void main(String[] args) {
        CameraFactory myFactory=new CameraFactory();
        Camera camera=myFactory.makeCamera(CameraFactory.CameraManufacturer.NIKON_FILM);
        Photographer photographer=new Photographer(camera);
        photographer.takePhotograph();
    }
}
