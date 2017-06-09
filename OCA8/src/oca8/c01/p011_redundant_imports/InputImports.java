/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p011_redundant_imports;

import java.nio.file.*;
/** 
 * The other answer is to import both classes explicitly:
 * 
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * 
 * Now let’s consider some imports that don’t work:
 * 
 * import java.nio.*; 
 *      NO GOOD – a wildcard only matches class names, not "file.*Files"
 * 
 * import java.nio.*.*; 
 *      NO GOOD – you can only have one wildcard and it must be at the end
 * 
 * import java.nio.files.Paths.*; 
 *      NO GOOD – you cannot import methods only class names
 * /

/**
 *
 * @author fabio.moreno.dlbi
 */
public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}
