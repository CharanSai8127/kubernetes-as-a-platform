# Network Policy Failures

NetworkPolicies control:
- pod-to-pod communication
- ingress traffic
- and egress traffic.

Misconfigured policies are one of the most common causes of:
- partial outages in Kubernetes.

---

# Why These Failures Are Dangerous

Network failures often become:
- asymmetric.

Examples:
- frontend can reach backend
- backend cannot reach database
- health checks fail while application traffic partially works.

This creates:
- inconsistent operational behavior.

---

# Silent Failure Risk

Applications may appear:
- partially healthy

while:
- critical dependencies remain unreachable.

This makes debugging:
- significantly harder.

---

# Operational Consequences

Network policy mistakes may create:
- connection timeouts
- retry storms
- dependency saturation
- and cascading failures.

---

# Key Insight

Distributed systems frequently fail through partial communication breakdowns instead of complete outages.
