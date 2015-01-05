jphp-awt-extension
==================

AWT Extension for Jphp Language

Available classes:
- DisplayMode
- GraphicsDevice
- GraphicsEnvironment

Exmaple:

```php
<?php
use php\awt\DisplayMode;
use php\awt\GraphicsEnvironment;


$device = GraphicsEnvironment::getDefaultScreenDevice();
$device->setFullScreenWindow($this->getScreen());
$device->setDisplayMode(
  new DisplayMode(1280, 720, 32, DisplayMode::REFRESH_RATE_UNKNOWN)
);
```
