
# Load Balancers 

# Choice for Load Balancing Strategy

## General guideline

### 1. Load Balancers for App Servers (Stateless): Round Robin Approach

- Reason for Round Robin:
	- App servers typically handle stateless requests, meaning each request is independent and do not require knowledge of previous interactions. 
	- Round Robin is a simple and efficient algorithm that distributes requests evenly across the app servers, ensuring load is balanced in an unbiased manner.
	- This approach **works well when the requests are of similar size** and **the app servers have roughly equivalent capacity**.
	
- ⚠️ When to consider Alternatives:
	- If **requests are not uniform in size**, consider **Weighted Round Robin** **or Least Connections** to account for differences in server capacities or current load. 
---
### 2. Load Balancers for Data Servers (Stateful): Consistent Hashing

---

