<?php
namespace php\awt;
use php\swing\Font;

/**
 * Class GraphicsEnvironment
 * @package php\awt
 */
class GraphicsEnvironment
{
    private function __construct(){}

    /**
     * Return default graphics device
     * @return GraphicsDevice
     */
    public static function getDefaultScreenDevice() {}


    /**
     * Return local graphics environment
     * @return GraphicsEnvironment
     */
    public static function getLocalGraphicsEnvironment() {}


    /**
     * Register font
     * @param Font $font
     */
    public function registerFont(Font $font) {}

    /**
     * @return array
     */
    public function getAllFonts() {}
}