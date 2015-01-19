<?php
namespace php\awt;
use php\swing\Font;
use php\swing\Graphics;

/**
 * Class Graphics2D
 * @package php\awt
 */
class Graphics2D
{
    /**
     * @param Graphics $graphics
     */
    public function __construct(Graphics $graphics) {}

    /**
     * @param int $x1
     * @param int $y1
     * @param int $x2
     * @param int $y2
     */
    public function drawLine($x1, $y1, $x2, $y2) {}

    /**
     * @param string $string
     * @param int $x
     * @param int $y
     */
    public function drawString($string, $x, $y) {}

    /**
     * @param Font $font
     */
    public function setFont(Font $font) {}

    /**
     * @return Font
     */
    public function getFont() { }

    /**
     * @param int $key
     * @param int $value
     */
    public function setRenderingHint($key, $value) {}
}