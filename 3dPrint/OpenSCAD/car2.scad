// adjust resolution
$fa = 1;
$fs = 0.4;
wheel_height = 4;
wheel_radius = 9;
scale([1.2,1,1]) {
// Car body base
cube([60,20,10],center=true);
// Car body top 
translate([0,0,10 - 0.001])
    cube([30,20,10],center=true);
// Front left wheel
translate([-18,-12,-4])
    rotate([90,0,-20])
    cylinder(h=wheel_height,r=wheel_radius);
// Front right wheel
translate([-18,15,-4])
    rotate([90,0,-20])
    cylinder(h=wheel_height,r=wheel_radius);
// Front axle
translate([-18,15,-4])
    rotate([90,0,0])
    cylinder(h=30,r=2);
// Rear axle
translate([18,-12,-4])
    rotate([90,0,0])
    cylinder(h=wheel_height,r=wheel_radius);
// Rear left wheel
translate([18,15,-4])
    rotate([90,0,0])
    cylinder(h=wheel_height,r=wheel_radius);
// Rear right wheel
translate([18,15,-4])
    rotate([90,0,0])
    cylinder(h=30,r=2);
}