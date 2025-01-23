
# Load Balancers 
---
# Load Balancing Algorithms

## 1. Round Robin
## 2. Weighted Round Robin

## 3. Least Connections

## 4. Consistent Hashing

## 5. IP Hash

## 6. Random

## 7. Least Response Times

## 8. Adaptive Load Balancing


What's Important?
1. Understanding each how each algorithm works and when to use it.
2. Discussing the trade-offs: pros and cons, and real-world scenarios.
3. Choosing the right algorithm based on system requirements, e.g. stateless vs. stateful, uniform vs. non-uniform, etc.
4. Addressing how algorithms handle node additions/removals and failures.

---


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

