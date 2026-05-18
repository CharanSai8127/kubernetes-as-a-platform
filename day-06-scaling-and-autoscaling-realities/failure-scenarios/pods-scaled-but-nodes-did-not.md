# Pods Scaled but Nodes Did Not

Horizontal autoscaling may request:
- additional replicas

while:
- cluster infrastructure still lacks enough capacity to run them.

This creates delayed operational convergence.

---

# Why This Happens

HPA scales:
- workloads.

Cluster Autoscaler scales:
- infrastructure nodes.

These systems operate independently and converge at different speeds.

---

# Pending Workloads

When clusters lack:
- CPU
- memory
- or schedulable capacity

new replicas remain:
- Pending

instead of becoming operationally useful.

During this delay:
existing workloads continue absorbing pressure.

---

# Infrastructure Provisioning Delay

Node scaling requires:
- cloud VM provisioning
- kubelet startup
- network initialization
- and scheduling convergence.

This process is frequently slower than:
- application-level scaling.

---

# Operational Consequences

While workloads remain Pending:
systems may experience:
- latency spikes
- retries
- queue buildup
- and operational instability.

Autoscaling appears active,
but capacity still remains unavailable.

---

# Operational Perspective

Reliable scaling depends heavily on:
- spare infrastructure capacity
- workload forecasting
- and coordinated scaling behavior across infrastructure and applications.

---

# Key Insight

Autoscaling replicas does not immediately create operational capacity when infrastructure scaling converges more slowly than workload demand.
