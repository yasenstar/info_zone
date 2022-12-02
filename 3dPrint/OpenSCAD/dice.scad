// dice
$fn=50;

minkowski() {

    difference() {

        cube(20, center=true);

        translate([9,0,0]) rotate([0,90,0]) cylinder(2,2,2);

    }

    sphere(2);
}