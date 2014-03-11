import requests
import json

r_allstudents = requests.get('https://api.clever.com/v1.1/students', auth=('DEMO_KEY', ''))
r_allsections = requests.get('https://api.clever.com/v1.1/sections', auth=('DEMO_KEY', ''))

json_allstudents = json.loads(r_allstudents.text)
json_allsections = json.loads(r_allsections.text)

json_allstudents_count = json_allstudents["paging"]["count"]
json_allsections_count = json_allsections["paging"]["count"]

print("Average Students per Section: " + "%.2f" % (json_allstudents_count/json_allsections_count))