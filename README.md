# Factory Pattern Lab

## Learning Goals

- Apply the factory pattern

## Instructions

You'll model a photographer who will manage the camera and use it to take
pictures. Here is what you will need:

- A private `CameraPackage.Camera` object.
- A constructor that initializes the internal instance of `CameraPackage.Camera` with the
  right type of camera from our Enum in `CameraManufacturer` - for now, you can
  choose which manufacturer you want to use - in reality the decision could be
  made by an user (by gathering input from them) or even by configuration.
- A `takePhotograph()` method that calls the `takePhotograph()` method of the
  `CameraPackage.Camera` class.

We will then model a studio, which will be our runner class and will create an
instance of `Photographer` and call its `takePhotograph()` method.
