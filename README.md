# About img2list

A little command line utility that will analyze a picture and list RGB values for each pixel in textual form, one line per pixel (x:z:R:G:V). You can then chain this utility with other filters to achieve the results you want...

I use ImageMagick to make visual "diffs" between 2 pictures (see http://stackoverflow.com/questions/5132749/diff-an-image-using-imagemagick), then this tool to process each modified pixel.

It was initially intended as a complement to my MinecraftRegionManager tool to automatically select map changes in the LOTR Minecraft mod (see http://lotr-minecraft-mod-exiles.wikia.com/wiki/LOTR_Mod_map_evolution), but could be useful for other things, for example with steganography...

# Compilation

Just type "Make".

# Installation

Not needed.

# Execution

Just type "java img2list path_to_the_image_file_to_process".

# Versions and changelog

1.00 2017-03-06

        Initial public release

# Further development plans

Perhaps provide a sixth column with colour names for known RGV triplets.

# License

This open source software is distributed under a BSD license (see the "License" file for details).

# Author

Hubert Tournier

March, 6 2017
