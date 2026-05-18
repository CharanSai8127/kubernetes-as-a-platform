# Cluster Autoscaler

The Cluster Autoscaler scales:
- infrastructure nodes

when Kubernetes lacks enough capacity to schedule workloads.

It operates at the:
- infrastructure layer
while:
- HPA operates at the workload layer.

---

# Why Cluster Autoscaler Exists

HPA may request:
- additional replicas

while:
- the cluster still lacks compute resources.

This creates:
- Pending pods
- scheduling failures
- and operational instability.

Cluster Autoscaler attempts to solve:
- infrastructure capacity shortages.

---

# Infrastructure Scaling Delays

Infrastructure scaling introduces significant delays:
- VM provisioning
- node startup
- kubelet registration
- network initialization
- and scheduling convergence.

This is frequently slower than pod scaling itself.

---

# Uneven Scaling Propagation

Distributed systems may experience:
- pod scaling faster than node scaling.

This creates temporary operational imbalance where:
- replicas exist logically
while:
- infrastructure capacity still remains unavailable.

---

# Cost and Reliability Tradeoffs

Aggressive infrastructure scaling improves:
- elasticity
- and workload responsiveness

but increases:
- infrastructure cost
- resource fragmentation
- and operational complexity.

---

# Operational Perspective

Reliable infrastructure scaling depends on:
- workload forecasting
- spare capacity
- and coordinated autoscaling behavior.

---

# Key Insight

Cluster Autoscaler scales infrastructure capacity,
not workload readiness or operational stability directly.
