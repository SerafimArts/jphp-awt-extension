<?php
namespace php\awt;

use php\swing\UIForm;
use php\awt\DisplayMode;

/**
 * Class GraphicsDevice
 * @package php\awt
 */
class GraphicsDevice
{
    const TYPE_RASTER_SCREEN    = 0;
    const TYPE_PRINTER          = 1;
    const TYPE_IMAGE_BUFFER     = 2;


    private function __construct(){}

    /**
     * Return supports of full screen mode
     * @return bool
     */
    public function isFullScreenSupported() { return false; }

    /**
     * Can change display mode
     * @return bool
     */
    public function isDisplayChangeSupported() { return false; }

    /**
     * Return current display mode
     * @return DisplayMode
     */
    public function getDisplayMode() { return new DisplayMode(0,0,0,0); }

    /**
     * Set full screen mode for $form
     * @param UIForm $form
     * @return null
     */
    public function setFullScreenWindow(UIForm $form) { return null; }

    /**
     * Set new display mode
     * @param DisplayMode $mode
     * @return null
     */
    public function setDisplayMode(DisplayMode $mode) { return null; }

    /**
     * Return available graphics memory
     * @return int
     */
    public function getAvailableAcceleratedMemory() { return 1; }
}