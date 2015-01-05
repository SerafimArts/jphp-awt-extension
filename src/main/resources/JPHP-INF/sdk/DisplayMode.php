<?php
namespace php\awt;

/**
 * Class DisplayMode
 * @package php\awt
 */
class DisplayMode
{
    const BIT_DEPTH_MULTI = -1;
    const REFRESH_RATE_UNKNOWN = 0;


    /**
     * @param int $width
     * @param int $height
     * @param int $bitDepth
     * @param int $refreshRate
     */
    public function __construct($width, $height, $bitDepth, $refreshRate) {}

    /**
     * Return display mode width
     * @return int
     */
    public function getWidth() { return 0; }

    /**
     * Return display mode height
     * @return int
     */
    public function getHeight() { return 0; }

    /**
     * Return display bit depth
     * @return int
     */
    public function getBitDepth() { return 0; }

    /**
     * Return display mode refresh rate
     * @return int
     */
    public function getRefreshRate() { return 0; }

    /**
     * Compares display mode
     * @return int
     */
    public function equals(DisplayMode $mode) { return false; }
}