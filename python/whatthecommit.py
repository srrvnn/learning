import requests
import bs4

def whatthecommit():

	r = requests.get('http://www.whatthecommit.com')
	soup = bs4.BeautifulSoup(r.text)

	return (soup.p.string)

if __name__=="__main__":
	commit = whatthecommit()
	print (commit)