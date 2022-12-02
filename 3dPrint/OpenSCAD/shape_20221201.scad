module arrow() {
    union() {
        cube([3,45,5]);
        translate([10,30,0]) rotate(40) cube([3,20,5]);
    }
}

module turn_line() {
    union() {
        translate([10,3,0])cube([3,19.5,5]);
        translate([10,20,0]) rotate(60) cube([3,10,5]);
    }
}

module black_lines() {
    union() {
        translate([17,9,0]) cube([6,29.5,5]);
        translate([0,28,0]) rotate(-65) cube([4,19,5]);
        translate([11.5,6.5,0]) rotate(-60) cube([3,11.5,5]);
        translate([21,35.5,0]) rotate(55) cube([3,15,5]);
    }
}

module half_shape() {
    difference() {
        union() {
            arrow();
            turn_line();
            black_lines();
        };
        translate([-5,-10,0]) cube([5,100,10]);
    }
}

module half_shape_mirror() {
    difference() {
        mirror([0,0,0])
        union() {
            arrow();
            turn_line();
            black_lines();
        };
        mirror([0,0,0]) translate([-5,-10,0]) cube([5,100,10]);
    }
}

half_shape();

mirror([10,0,0]) half_shape();


//translate([0,25,0]) cube([60,60,4], center=true);