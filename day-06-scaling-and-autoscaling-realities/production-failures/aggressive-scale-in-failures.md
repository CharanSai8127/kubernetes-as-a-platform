# Aggressive Scale-In Failures

Scale-in is operationally more dangerous than scale-out.

Removing active capacity too aggressively may destabilize distributed systems even while traffic still exists.

---

# Why Scale-In Is Risky

Scale-in removes:
- replicas
- workers
- connections
- and processing capacity

while workloads may still actively process:
- inflight requests
- queued tasks
- or live traffic.

This creates operational risk.

---

# Inflight Request Failures

Aggressive scale-in may:
- terminate active requests
- interrupt processing
- drop connections
- or lose transient operational state

during scaling events.

This directly impacts:
- latency
- reliability
- and user experience.

---

# Delayed Traffic Convergence

Traffic routing requires time to:
- redistribute requests
- update endpoints
- and converge toward remaining workloads.

Removing replicas too quickly may temporarily overload surviving workloads.

---

# Cascading Instability

Aggressive downscaling may trigger:
- retries
- queue buildup
- latency amplification
- and dependency saturation

inside distributed systems.

---

# Operational Safeguards

Reliable scale-in depends heavily on:
- graceful draining
- stabilization windows
- termination coordination
- and conservative scaling policies.

---

# Key Insight

Removing operational capacity safely is significantly harder than adding capacity inside distributed systems.
