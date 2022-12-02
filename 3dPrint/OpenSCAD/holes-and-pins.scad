$fn=100;

difference() {
    cube([16,28,2]);
    
    translate([8,5,-1]) cylinder(4,3,3);
    translate([8,20,-1]) cylinder(4,6,6);
}

translate([20,0,0])
union() {
    cube([16,28,2]);
    
    translate([8,5,0]) cylinder(4,2.9,2.9);
    translate([8,20,0]) cylinder(4,5.9,5.9);
}