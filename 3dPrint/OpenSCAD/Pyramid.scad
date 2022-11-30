//Pyramid
for (z_position = [0:0.1:40]) {
    translate([0, 0, z_position])
        cube([80-2*z_position,80-2*z_position,z_position], center = true);
}