difference() {
    sphere(30);
    translate([16,16,16]) cube(30, center=true);
    translate([16,16,-16]) cube(30, center=true);
    translate([16,-16,16]) cube(30, center=true);
    translate([16,-16,-16]) cube(30, center=true);
    translate([-16,16,16]) cube(30, center=true);
    translate([-16,16,-16]) cube(30, center=true);
    translate([-16,-16,16]) cube(30, center=true);
    translate([-16,-16,-16]) cube(30, center=true);
}