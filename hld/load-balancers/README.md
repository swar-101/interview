# Load Balancers

## Tasks
1. Provides a unified view of the backend to the user (single point of contact).
2. Distributes the load evenly across all servers.

## Health Check / Heartbeat
- Monitors server health to route traffic only to healthy servers.

## Scalability at Google Scale
- **Problem**: Single LB can become a bottleneck.
- **Solution**: Use multiple Load Balancers.
  - Assist with **DNS** to distribute traffic across multiple LBs.
---


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



# General guideline for Choosing the Correct LB Strategy

![Choosing the Correct LB Diagram](./assets/choice-of-load-balancers.png)

### 1. Load Balancers for App Servers (Stateless): Round Robin Approach

- Reason for Round Robin:
	- App servers typically handle stateless requests, meaning each request is independent and do not require knowledge of previous interactions. 
	- Round Robin is a simple and efficient algorithm that distributes requests evenly across the app servers, ensuring load is balanced in an unbiased manner.
	- NOTE: This approach **works well when the requests are of similar size** and **the app servers have roughly equivalent capacity**.
	
- ⚠️ When to Consider Alternatives:
	- If **requests are not uniform in size**, consider **Weighted Round Robin** **or Least Connections** to account for differences in server capacities or current load. 
---
### 2. Load Balancers for Data Servers (Stateful): Consistent Hashing

- Reason for Consistent Hashing
	- Data Servers often store state (e.g., user data, cached content) and need requests routed to the server holding the relevant state.
	- Consistent Hashing ensures that requests for the same data (e.g. identified by a key) are consistently routed to the same server. This minimizes cache misses and reduces the overhead or re-distributing data across servers when nodes are added or removed.
	- This is especially critical in distributed systems like distributed caches (e.g., Redis cluster) or distributed databases.

- ⚠️ When to Consider Alternatives:
	- If the **system allows for full replication of data across all nodes**, any **node can handle any request**, and consistent hashing may not be necessary. 
	- In scenarios where the **latency of re-distributing data due to node changes is tolerable**, **simpler approaches** **might suffice.**

---

