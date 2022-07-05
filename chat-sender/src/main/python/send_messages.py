import requests

url = 'http://localhost:8081/api/v1/messages'

for i in range(1000):
    obj = {'content': f'This is message number {i}.'}
    requests.post(url, json=obj)
