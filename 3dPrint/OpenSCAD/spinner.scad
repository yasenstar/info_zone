$fn=100;
union() {
    translate([0,0,4]) cylinder(10,4,4);
    cylinder(5,25,10);
    translate([0,0,-15]) cylinder(15,0,25);
}