import os 

path = "C:\Users\esgee\Desktop\Documents\Academics\CSCI 570"
files = os.listdir(path);

os.chdir(path)

for x in files: 
	old_name = str(x)	
	if "cs570" not in old_name: continue
	new_name = old_name.replace("cs570",'')
	os.rename(x,new_name)