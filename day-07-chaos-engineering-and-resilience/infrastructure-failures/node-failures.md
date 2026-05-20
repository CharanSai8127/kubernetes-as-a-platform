# Node Failures

Node failures are infrastructure-level disruptions that affect:
- all workloads running on a node.

These failures may originate from:
- hardware instability
- kernel failures
- kubelet crashes
- resource exhaustion
- or noisy neighbors.

---

# Resource Exhaustion

Improper workload isolation may allow:
- unbounded CPU usage
- memory exhaustion
- and eviction pressure.

Missing requests and limits increase the risk of:
- unstable node behavior.

---

# Kubernetes Recovery

When a node becomes unavailable:
- workloads are rescheduled onto healthy nodes.

However recovery still requires:
- scheduling
- startup
- readiness
- and traffic propagation.

---

# Operational Risks

Large node failures may create:
- startup storms
- reconnect amplification
- and dependency saturation.

Especially when:
- many pods recover simultaneously.

---

# Key Insight

Infrastructure recovery itself may amplify distributed-system pressure.
