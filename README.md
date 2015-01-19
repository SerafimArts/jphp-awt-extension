jphp-awt-extension
==================

AWT Extension for Jphp Language

Available classes:
- `php\awt\DisplayMode`
- `php\awt\GraphicsDevice`
- `php\awt\GraphicsEnvironment`

Exmaple:

```php
<?php
use php\swing\UIForm;
use php\awt\DisplayMode;
use php\awt\GraphicsEnvironment;


$form = new UIForm;
$form->visible = true;

$device = GraphicsEnvironment::getDefaultScreenDevice();
$device->setFullScreenWindow($form);
$device->setDisplayMode(
  new DisplayMode(1280, 720, 32, DisplayMode::REFRESH_RATE_UNKNOWN)
);
```
