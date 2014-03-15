import os
import shutil

library = "D:\Music\_Library\AR Rahman"
soundtracks = "D:\Music\Soundtracks\AR Rahman"
files = os.listdir(library);

for x in files: 

	old_name = str(x)	
	if "LQ" not in old_name: continue		

	new_name = old_name.replace(" - LQ", "")
	
	src = os.path.join(library, old_name)
	des = os.path.join(soundtracks, new_name)

	# shutil.copytree(src, des)
	shutil.rmtree(src)