# Noisy Neighbor Problems

Noisy neighbors occur when:
- one workload consumes excessive shared resources,
impacting:
- other workloads on the same node.

---

# Common Resource Contention

Shared resource pressure may involve:
- CPU starvation
- memory exhaustion
- disk IO contention
- or network bandwidth saturation.

---

# Why This Happens

Workloads without:
- requests
- limits
- or isolation policies

may consume:
- disproportionate compute resources.

---

# Operational Consequences

Noisy neighbors may create:
- latency spikes
- unstable scheduling
- pod evictions
- and node degradation.

This frequently appears as:
- intermittent production instability.

---

# Kubernetes Mitigation

Kubernetes provides:
- requests and limits
- QoS classes
- taints and tolerations
- and workload isolation

to reduce contention.

---

# Key Insight

Shared infrastructure without resource isolation increases operational instability dramatically.
