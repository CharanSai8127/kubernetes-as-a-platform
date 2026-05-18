# Scale-In Killed Inflight Requests

Removing workload capacity aggressively may interrupt:
- active requests
- ongoing transactions
- queue processing
- and persistent connections.

This is one of the most dangerous operational risks during scaling.

---

# Why This Happens

Scale-in removes:
- replicas
- workers
- and processing capacity

while workloads may still actively process:
- inflight traffic
- queued work
- or open connections.

Without graceful coordination:
- active operations terminate abruptly.

---

# Operational Consequences

Aggressive scale-in may create:
- dropped requests
- failed transactions
- retries
- queue buildup
- and cascading instability

inside distributed systems.

---

# Delayed Traffic Convergence

Traffic routing requires time to:
- update endpoints
- redistribute requests
- and stop sending traffic toward terminating workloads.

Removing capacity too quickly amplifies:
- overload
- and retry pressure.

---

# Graceful Draining

Reliable scale-in requires:
- connection draining
- graceful termination
- workload shutdown coordination
- and conservative scaling policies.

This helps preserve:
- operational correctness
during convergence.

---

# Operational Perspective

Scale-in safety is significantly more important than scale-out speed inside production distributed systems.

---

# Key Insight

Removing active workload capacity without graceful convergence may destabilize otherwise healthy distributed systems.
